package library;
public class pojo_user
{
	private int id;
	private String name, email, phone,password,role;
	public pojo_user() 
	{
		
	}
	
	
		public pojo_user(int id, String name, String email, String phone, String password, String role) {
		super();
		id = id;
		name = name;
		email = email;
		phone = phone;
		password = password;
		role = role;
	}
		
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPhone() {
			return phone;
		}


		public void setPhone(String phone) {
			this.phone = phone;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}


		@Override
		public String toString() {
			return "pojo_user [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password="
					+ password + ", role=" + role + "]";
		}



		
}