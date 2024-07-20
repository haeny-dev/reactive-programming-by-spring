package com.haeny.book.reactiveProgrammingBySpring.chapter01.example1;

import java.util.Arrays;
import java.util.List;

/**
 * 선언형 프로그래밍 코드 예제
 *
 * 선언형 프로그래밍 방식의 특징
 * - 동작을 구체적으로 명시하지 않고 목표만 선언
 * - 메서드 체인을 형성하여 코드를 구성할 수 있음
 * - 그로 인해, 코드가 간결해지고 가독성이 좋아짐
 * - 함수형 프로그래밍으로 구성
 *
 * 명령형 프로그래밍과 선언형 프로그래밍의 차이를 쉽게 설명
 * => 명령형: 내가 직접 식당의 정수기로 걸어가서 차가운 물을 컵에 따르는 행동
 * => 선언형: 종업원에게 "여기 물 한잔 주세요" 라고 요청하는 것
 */
public class Example1_2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 21, 10, 8, 11);
        int sum = numbers.stream()
                .filter(number -> number > 6 && (number % 2 != 0))
                .mapToInt(number -> number)
                .sum();

        System.out.println("합계: " + sum);
    }
}
