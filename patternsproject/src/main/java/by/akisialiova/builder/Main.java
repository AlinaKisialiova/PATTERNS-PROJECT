package by.akisialiova.builder;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("The BUILDER pattern builds a complex object using simple objects and using a step by step approach." +
                "This builder is independent of other objects.");
        System.out.println("\nDifferences between the BUILDER and the ABSTRACT FACTORY:");
        getDifferencesFromFactory().forEach(System.out::println);
    }

    private static List<String> getDifferencesFromFactory() {

    return Arrays.asList("1) The BUILDER focuses on constructing a complex object step by step.\nThe ABSTRACT FACTORY emphasizes a family of product objects (either simple or complex).\n\n" +
            "2) The BUILDER returns the product as a final step.\nThe ABSTRACT FACTORY is concerned, the product gets returned immediately.");
    }
}
