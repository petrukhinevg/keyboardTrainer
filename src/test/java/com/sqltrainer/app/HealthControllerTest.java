package com.sqltrainer.app;

import org.junit.jupiter.api.Test;

class HealthControllerTest {

    private final HealthController healthController = new HealthController();

    @Test
    void shouldReturnOkStatus() {
        if (!"ok".equals(healthController.health().get("status"))) {
            throw new AssertionError("Health status should be ok");
        }
    }
}
