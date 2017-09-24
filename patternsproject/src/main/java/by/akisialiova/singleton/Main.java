package by.akisialiova.singleton;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("The SINGLETON pattern restricts the instantiation of a class to one object.");
        System.out.println("\nKey points of creating the SINGLETON:");
        getPoints().forEach(System.out::println);
        System.out.println("\nKey problems of using the SINGLETON:");
        getProblems().forEach(System.out::println);
    }

    private static List<String> getProblems() {
        final String srp = "Violating the SRP (Single Responsibility Principle)";
        final String globalState = "Global state";
        final String reducingTestability = "Reducing testability";
        final String hidingDependency = "Hiding of dependency from Singleton class";
        return Arrays.asList(srp, globalState, reducingTestability, hidingDependency);
    }

    private static List<String> getPoints() {
        final String privateConstructor = "Private constructor";
        final String privateStaticClassInstance = "Private static class instance";
        final String methodForGetting = "Get-method for getting the instance (getInstance())";
        return Arrays.asList(privateConstructor, privateStaticClassInstance, methodForGetting);
    }
}
