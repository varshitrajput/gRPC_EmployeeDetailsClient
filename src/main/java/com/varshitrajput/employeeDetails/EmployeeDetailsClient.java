package com.varshitrajput.employeeDetails;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import com.google.protobuf.Timestamp;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.EmployeeDetailsGrpc;
import proto.EmployeeDetailsOuterClass;


public class EmployeeDetailsClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        EmployeeDetailsGrpc.EmployeeDetailsBlockingStub stub = EmployeeDetailsGrpc.newBlockingStub(channel);

        Instant instant = LocalDate.of(2021, 1, 1).atStartOfDay(ZoneId.systemDefault()).toInstant();

// Create a Timestamp from the Instant
        Timestamp timestamp = Timestamp.newBuilder()
                .setSeconds(instant.getEpochSecond())
                .setNanos(instant.getNano())
                .build();

        EmployeeDetailsOuterClass.EmployeeID employeeID = stub.setEmployeeDetails(EmployeeDetailsOuterClass.Employee.newBuilder(
                ).setFirstName("Varshit")
                .setLastName("Rajput")
                .setMobileNumber("1234567890")
                .setDateOfJoining(timestamp).build());
        System.out.println("employeeId:"+ employeeID.getId());
        EmployeeDetailsOuterClass.Employee employee = stub.getEmployeeDetails(employeeID);
        System.out.println("firstName:"+ employee.getFirstName());
        System.out.println("lastName:"+ employee.getLastName());
        System.out.println("mobileNumber:"+ employee.getMobileNumber());
        System.out.println("dateOfJoining:"+ employee.getDateOfJoining().getSeconds());
        channel.shutdown();
    }
}
