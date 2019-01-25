package Functional;

import java.util.List;
import java.util.stream.Collectors;

public class Functional_1 {

    //Given a list of integers, return a list where each integer is multiplied by 2.

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        //nums.replaceAll(num -> num * 2);
        //return nums;

    }

    //Given a list of integers, return a list where each integer is multiplied with itself.

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        //nums.replaceAll(num -> num * num);
        //return nums;
    }

    //Given a list of strings, return a list where each string has "*" added at its end.

    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(str -> str + "*")
                .collect(Collectors.toList());

        //strings.replaceAll(str -> str + "*");
        //return strings;
    }

    //Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.

    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(str -> str + str + str)
                .collect(Collectors.toList());

        //strings.replaceAll(str -> str + str + str);
        //return strings;
    }

    //Given a list of strings, return a list where each string has "y" added at its start and end.

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(str -> "y" + str + "y")
                .collect(Collectors.toList());

        //strings.replaceAll(str -> "y" + str + "y");
        //return strings;
    }

    //Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(num -> (num + 1) * 10)
                .collect(Collectors.toList());

        //nums.replaceAll(num -> (num + 1) * 10);
        //return nums;
    }

    //Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(num -> num % 10)
                .collect(Collectors.toList());

        //nums.replaceAll(num -> num % 10);
        //return nums;
    }

    //Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

    public List<String> lower(List<String> strings) {
        return strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        //strings.replaceAll(str -> str.toLowerCase());
        //return strings;

    }

    //Given a list of strings, return a list where each string has all its "x" removed.

    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(str -> str.replaceAll("x", ""))
                .collect(Collectors.toList());

        //strings.replaceAll(str -> str.replaceAll("x", ""));
        //return strings;
    }



}
