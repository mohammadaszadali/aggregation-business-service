package com.dtag.bmp.service.aggregation.dto.types;

public class EmailRequestTempPass {

		private String toMail;
		private String messageBody;
		private String subject;
		private String firstName;
		private String lastName;
		public String getToMail() {
			return toMail;
		}
		public void setToMail(String toMail) {
			this.toMail = toMail;
		}
		public String getMessageBody() {
			return messageBody;
		}
		public void setMessageBody(String messageBody) {
			this.messageBody = messageBody;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		@Override
		public String toString() {
			return "EmailRequestTempPass [toMail=" + toMail + ", messageBody=" + messageBody + ", subject=" + subject
					+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		
		

}
