package Functional;

import java.util.List;
import java.util.stream.Collectors;

public class Functional_2 {

    //Given a list of integers, return a list of the integers, omitting any that are less than 0.

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num >= 0)
                .collect(Collectors.toList());

        //nums.removeIf(num -> num < 0);
        //return nums;
    }

    //Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(num -> (num % 10) != 9)
                .collect(Collectors.toList());

        //nums.removeIf(num -> (num % 10) == 9);
        //return nums;
    }

    //Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num <= 12 || num > 19)
                .collect(Collectors.toList());

        //nums.removeIf(num -> (num >= 13 && num <= 19));
        //return nums;
    }

    //Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the
    // str.contains(x) method returns a boolean)

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(str -> !str.contains("z"))
                .collect(Collectors.toList());

        //strings.removeIf(str -> str.contains("z"));
        //return strings;
    }

    //Given a list of strings, return a list of the strings, omitting any string length 4 or more.

    public List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(str -> str.length() < 4)
                .collect(Collectors.toList());

        //strings.removeIf(str -> str.length() >= 4);
        //return strings;
    }

    //Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(str -> str.length() < 3 || str.length() > 4)
                .collect(Collectors.toList());

        //strings.removeIf(str -> (str.length() == 3 || str.length() == 4));
        //return strings;
    }

    //Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting
    // strings that contain "yy" as a substring anywhere.

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(str -> !str.contains("yy") && !str.endsWith("y"))
                .map(str -> str + "y")
                .collect(Collectors.toList());

        //strings.replaceAll(s -> s + "y");
        //strings.removeIf(str-> str.contains("yy"));
        //return strings;
    }

    //Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of
    // the resulting numbers that end in 2.

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(num -> num * 2)
                .filter(num -> (num % 10) != 2)
                .collect(Collectors.toList());

        //nums.replaceAll(num->num * 2);
        //nums.removeIf(num -> (num % 10) == 2);
        //return nums;
    }


    //Given a list of integers, return a list of those numbers squared and the product added to 10, omitting
    // any of the resulting numbers that end in 5 or 6.

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(num -> num * num + 10)
                .filter(num -> num % 10 != 5 && num % 10 != 6)
                .collect(Collectors.toList());

        //nums.replaceAll(num -> (num * num) + 10);
        //return nums;

    }

}
