package com.neoteric.order;

public class LoginService {




        private final String existing_username = "admin";
        private final String existing_password = "12345";

        public boolean login(String username, String password) throws InvalidCredentialsException {
            if (username == null || password == null) {
                throw new InvalidCredentialsException("Username or Password cannot be null!");
            }

            if (!(username.equals(existing_username) && password.equals(existing_password))) {
                throw new InvalidCredentialsException("Invalid Username or Password!");
            }

            System.out.println("✅ Login Successful!");
            return true;
        }
    }

