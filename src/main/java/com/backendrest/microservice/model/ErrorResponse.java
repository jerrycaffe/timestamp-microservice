package com.backendrest.microservice.model;

import java.util.Objects;

public class ErrorResponse extends Throwable {


        private final int status;
        private final String message;


        public ErrorResponse(int status, String message) {
            this.status = status;
            this.message = message;
        }


        public int getStatus() {
            return status;
        }


        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ErrorResponse that = (ErrorResponse) o;
            return getStatus() == that.getStatus()
                    && Objects.equals(getMessage(), that.getMessage());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getStatus(), getMessage());
        }

}
