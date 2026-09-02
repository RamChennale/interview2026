package com.selenium.A3_apiInterviewEx;

public class PostModelPOJO {

        private String title;
        private String body;
        private int userId;
        private int id;

        // Default constructor
        public PostModelPOJO() {
        }

        // Parameterized constructor
        public PostModelPOJO(String title, String body, int userId, int id) {
            this.title = title;
            this.body = body;
            this.userId = userId;
            this.id = id;
        }

        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }


