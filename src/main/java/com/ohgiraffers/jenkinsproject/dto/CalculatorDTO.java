package com.ohgiraffers.jenkinsproject.dto;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {
    @NonNull
    private int num1;
    // private final int num1 = 1; 로도 가능하긴 함!
    @NonNull
    private int num2;
    private int sum;
}
