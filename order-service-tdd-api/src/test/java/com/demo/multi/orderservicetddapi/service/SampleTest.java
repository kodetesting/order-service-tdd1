package com.demo.multi.orderservicetddapi.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SampleTest {

    @Test
    void test1() {
        int i =1;
        Assertions.assertThat(i)
                .isEqualTo(1)
                .isEven();
    }


}
