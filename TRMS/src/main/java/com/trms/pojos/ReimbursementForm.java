package com.trms.pojos;

public class ReimbursementForm {
		
		private Integer formid;
		private Integer userid;
		private String firstname;
		private String lastname;
		private String date_of_event;
		private String time_of_event;
		private String location_of_event;
		private String description;
		private String event_cost;
		private String grading_format;
		private String type_of_event;
		private String comments;
		private String status;
		
		public ReimbursementForm() {
			super();
		}
		
		public ReimbursementForm(String firstname, String lastname, String date_of_event, String time_of_event,
				String location_of_event, String description, String event_cost, String grading_format,
				String type_of_event, String comments) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.date_of_event = date_of_event;
			this.time_of_event = time_of_event;
			this.location_of_event = location_of_event;
			this.description = description;
			this.event_cost = event_cost;
			this.grading_format = grading_format;
			this.type_of_event = type_of_event;
			this.comments = comments;
		}



		public ReimbursementForm(Integer formid, Integer userid, String firstname, String lastname,
				String date_of_event, String time_of_event, String location_of_event, String description,
				String event_cost, String grading_format, String type_of_event, String comments, String status) {
			super();
			this.formid = formid;
			this.userid = userid;
			this.firstname = firstname;
			this.lastname = lastname;
			this.date_of_event = date_of_event;
			this.time_of_event = time_of_event;
			this.location_of_event = location_of_event;
			this.description = description;
			this.event_cost = event_cost;
			this.grading_format = grading_format;
			this.type_of_event = type_of_event;
			this.comments = comments;
			this.status = status;
		}

		public ReimbursementForm(Integer formid, Integer userid, String firstname, String lastname,
				String date_of_event, String time_of_event, String location_of_event, String description,
				String event_cost, String grading_format, String type_of_event, String comments) {
			super();
			this.formid = formid;
			this.userid = userid;
			this.firstname = firstname;
			this.lastname = lastname;
			this.date_of_event = date_of_event;
			this.time_of_event = time_of_event;
			this.location_of_event = location_of_event;
			this.description = description;
			this.event_cost = event_cost;
			this.grading_format = grading_format;
			this.type_of_event = type_of_event;
			this.comments = comments;
		}

		public Integer getFormid() {
			return formid;
		}

		public void setFormid(Integer formid) {
			this.formid = formid;
		}

		public Integer getUserid() {
			return userid;
		}

		public void setUserid(Integer userid) {
			this.userid = userid;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getDate_of_event() {
			return date_of_event;
		}

		public void setDate_of_event(String date_of_event) {
			this.date_of_event = date_of_event;
		}

		public String getTime_of_event() {
			return time_of_event;
		}

		public void setTime_of_event(String time_of_event) {
			this.time_of_event = time_of_event;
		}

		public String getLocation_of_event() {
			return location_of_event;
		}

		public void setLocation_of_event(String location_of_event) {
			this.location_of_event = location_of_event;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEvent_cost() {
			return event_cost;
		}

		public void setEvent_cost(String event_cost) {
			this.event_cost = event_cost;
		}

		public String getGrading_format() {
			return grading_format;
		}

		public void setGrading_format(String grading_format) {
			this.grading_format = grading_format;
		}

		public String getType_of_event() {
			return type_of_event;
		}

		public void setType_of_event(String type_of_event) {
			this.type_of_event = type_of_event;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((comments == null) ? 0 : comments.hashCode());
			result = prime * result + ((date_of_event == null) ? 0 : date_of_event.hashCode());
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + ((event_cost == null) ? 0 : event_cost.hashCode());
			result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
			result = prime * result + ((formid == null) ? 0 : formid.hashCode());
			result = prime * result + ((grading_format == null) ? 0 : grading_format.hashCode());
			result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
			result = prime * result + ((location_of_event == null) ? 0 : location_of_event.hashCode());
			result = prime * result + ((status == null) ? 0 : status.hashCode());
			result = prime * result + ((time_of_event == null) ? 0 : time_of_event.hashCode());
			result = prime * result + ((type_of_event == null) ? 0 : type_of_event.hashCode());
			result = prime * result + ((userid == null) ? 0 : userid.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ReimbursementForm other = (ReimbursementForm) obj;
			if (comments == null) {
				if (other.comments != null)
					return false;
			} else if (!comments.equals(other.comments))
				return false;
			if (date_of_event == null) {
				if (other.date_of_event != null)
					return false;
			} else if (!date_of_event.equals(other.date_of_event))
				return false;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (event_cost == null) {
				if (other.event_cost != null)
					return false;
			} else if (!event_cost.equals(other.event_cost))
				return false;
			if (firstname == null) {
				if (other.firstname != null)
					return false;
			} else if (!firstname.equals(other.firstname))
				return false;
			if (formid == null) {
				if (other.formid != null)
					return false;
			} else if (!formid.equals(other.formid))
				return false;
			if (grading_format == null) {
				if (other.grading_format != null)
					return false;
			} else if (!grading_format.equals(other.grading_format))
				return false;
			if (lastname == null) {
				if (other.lastname != null)
					return false;
			} else if (!lastname.equals(other.lastname))
				return false;
			if (location_of_event == null) {
				if (other.location_of_event != null)
					return false;
			} else if (!location_of_event.equals(other.location_of_event))
				return false;
			if (status == null) {
				if (other.status != null)
					return false;
			} else if (!status.equals(other.status))
				return false;
			if (time_of_event == null) {
				if (other.time_of_event != null)
					return false;
			} else if (!time_of_event.equals(other.time_of_event))
				return false;
			if (type_of_event == null) {
				if (other.type_of_event != null)
					return false;
			} else if (!type_of_event.equals(other.type_of_event))
				return false;
			if (userid == null) {
				if (other.userid != null)
					return false;
			} else if (!userid.equals(other.userid))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "ReimbursementForm [formid=" + formid + ", userid=" + userid + ", firstname=" + firstname
					+ ", lastname=" + lastname + ", date_of_event=" + date_of_event + ", time_of_event=" + time_of_event
					+ ", location_of_event=" + location_of_event + ", description=" + description + ", event_cost="
					+ event_cost + ", grading_format=" + grading_format + ", type_of_event=" + type_of_event
					+ ", comments=" + comments + ", status=" + status + "]";
		}
}
