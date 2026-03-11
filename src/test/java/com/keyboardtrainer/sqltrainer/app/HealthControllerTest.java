package com.keyboardtrainer.sqltrainer.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HealthControllerTest {

    private final HealthController healthController = new HealthController();

    @Test
    void shouldReturnOkStatus() {
        assertThat(healthController.health()).containsEntry("status", "ok");
    }
}
