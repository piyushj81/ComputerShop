package com.shop.modeldao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.shop.dto.Admin;
import com.shop.dto.Cart;
import com.shop.dto.Customer;
import com.shop.dto.Form;
import com.shop.dto.Product;
import com.shop.dto.Shop;

public class CustomerModel {
	public static Connection createConnection() {
		Connection con = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "root");

		} catch (Exception e) {
			e.printStackTrace();

		}

		return con;

	}

	public int checkCustomerlogin(String user, String password) {
		Connection con = null;
		int i = 0;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from customerlogin where username=? and password=?");
			ps.setString(1, user);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				i = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;

	}

	public int admitCustomer(Customer cst) {
		int i = 0;
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("insert into customerlogin values(?, ?, ?)");
			ps.setString(1, cst.getPhone());
			ps.setString(2, cst.getName());
			ps.setString(3, cst.getPassword());
			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}

		return i;
	}

	public int checkadminlogin(String adminusername, String pwd) {
		int i = 0;
		Connection con = null;

		try {
			con = createConnection();
			PreparedStatement ps = con
					.prepareStatement("select * from adminlogin where adminusername=? and password=?");
			ps.setString(1, adminusername);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				i = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public ArrayList<Product> getmouseDetails() {
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Connection con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from mouse");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"),
						rs.getString("price"), rs.getString("pic"));
				list.add(pt);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Product selectdatafrommouseincart(String id, String phone) {
		Product pt = null;
		Connection con = null;

		try {
			con = createConnection();

			PreparedStatement ps = con.prepareStatement("select * from mouse where id=?");
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"), rs.getString("price"),
						rs.getString("pic"));

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return pt;
	}

	public int insertproductdata(Product pt, String id, String phone) {

		int i = 0;
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("insert into cart values(?,?,?,?,?,?)");
			ps.setString(1, phone);
			ps.setString(2, id);
			ps.setString(3, pt.getPname());
			ps.setInt(4, pt.getModel());
			ps.setString(5, pt.getPrice());
			ps.setString(6, pt.getPic());
			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}

		return i;
	}

	public ArrayList<Product> getusercartdetail(String phone) {
		Product pt = null;
		ArrayList<Product> list1 = new ArrayList<Product>();
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from cart where phone=?");
			ps.setString(1, phone);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"), rs.getString("price"),
						rs.getString("pic"));

				list1.add(pt);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return list1;
	}

	public int deleteitem(String id) {
		Connection con = null;
		int i = 0;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("delete  from cart where id=?");
			ps.setString(1, id);
			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<Product> getusercartdetails(String phone) {
		Product pt = null;
		ArrayList<Product> list1 = new ArrayList<Product>();
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from cart where phone=?");
			ps.setString(1, phone);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"), rs.getString("price"),
						rs.getString("pic"));

				list1.add(pt);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return list1;
	}

	public ArrayList<Product> getmotherboardDetails() {
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Connection con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from motherboard");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"),
						rs.getString("price"), rs.getString("pic"));
				list.add(pt);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Product selectdatafrommotherboardincart(String id, String phone) {
		Product pt = null;
		Connection con = null;

		try {
			con = createConnection();

			PreparedStatement ps = con.prepareStatement("select * from motherboard where id=?");
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"), rs.getString("price"),
						rs.getString("pic"));

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return pt;
	}

	public ArrayList<Product> getcpuDetails() {
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Connection con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from cpu");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"),
						rs.getString("price"), rs.getString("pic"));
				list.add(pt);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Product selectdatafromcpuincart(String id, String phone) {
		Product pt = null;
		Connection con = null;

		try {
			con = createConnection();

			PreparedStatement ps = con.prepareStatement("select * from cpu where id=?");
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"), rs.getString("price"),
						rs.getString("pic"));

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return pt;
	}

	public ArrayList<Product> getmonitorDetails() {
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Connection con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from monitor");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"),
						rs.getString("price"), rs.getString("pic"));
				list.add(pt);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Product selectdatafrommonitorincart(String id, String phone) {
		Product pt = null;
		Connection con = null;

		try {
			con = createConnection();

			PreparedStatement ps = con.prepareStatement("select * from monitor where id=?");
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"), rs.getString("price"),
						rs.getString("pic"));

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return pt;
	
	
	}

	public ArrayList<Product> getfanDetails() {
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Connection con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from fan");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"),
						rs.getString("price"), rs.getString("pic"));
				list.add(pt);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Product selectdatafromfanincart(String id, String phone) {
		Product pt = null;
		Connection con = null;

		try {
			con = createConnection();

			PreparedStatement ps = con.prepareStatement("select * from fan where id=?");
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"), rs.getString("price"),
						rs.getString("pic"));

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return pt;
	
	

	
	}

	public ArrayList<Product> getramDetails() {
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Connection con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from ram");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"),
						rs.getString("price"), rs.getString("pic"));
				list.add(pt);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Product selectdatafromramincart(String id, String phone) {
		Product pt = null;
		Connection con = null;

		try {
			con = createConnection();

			PreparedStatement ps = con.prepareStatement("select * from ram where id=?");
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"), rs.getString("price"),
						rs.getString("pic"));

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return pt;
	
	

		
		
			}

	public ArrayList<Product> getkeyboardDetails() {
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			Connection con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from keyboard");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"),
						rs.getString("price"), rs.getString("pic"));
				list.add(pt);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Product selectdatafromkeyboardincart(String id, String phone) {
		Product pt = null;
		Connection con = null;

		try {
			con = createConnection();

			PreparedStatement ps = con.prepareStatement("select * from keyboard where id=?");
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				pt = new Product(rs.getString("id"), rs.getString("pname"), rs.getInt("model"), rs.getString("price"),
						rs.getString("pic"));

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return pt;
	
	}

	public ArrayList<Cart> showcartitemtoadmin() {
	
	 ArrayList<Cart> list2 = new ArrayList<Cart>();
	 try {
	  Connection con = createConnection();
	 
	 PreparedStatement ps = con.prepareStatement("select * from cart");
	 
	 ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Cart ct = new Cart(rs.getString("phone"),rs.getString("id"), rs.getString("pname"),rs.getInt("model"), rs.getString("price"),rs.getString("pic"));
			list2.add(ct);
		}
	 }catch(Exception e){
			e.printStackTrace();
		
		}
	
	
	return list2;	
	
	}

	public int insertshoppingDetails(String id, String cname,Shop s) {
		int i=0;
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps =	con.prepareStatement("insert into shopping values(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, id);
			ps.setString(2, s.getPhone());
			ps.setString(3, cname);
			ps.setString(4, s.getPic());
			ps.setString(5, s.getPname());
			ps.setInt(6, s.getModel());

			ps.setString(7, s.getPrice());
			ps.setString(8, null);
			ps.setString(9, null);
			ps.setString(10,null);

			ps.setString(11,null);
			
			i = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
	}
		return i;
	}

	public Shop selectshoppingDetailsfromcarttable(String id,String cname) {
		 Shop s = null;
		 Connection con = null;
		
		try {
			   con = createConnection();
			 
			 PreparedStatement ps = con.prepareStatement("select * from cart where id=?");
			ps.setString(1, id);
			 ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					s  = new Shop(rs.getString("id"),rs.getString("phone"), rs.getString("pname"),rs.getInt("model"), rs.getString("price"),rs.getString("pic"));
					
				}
				
			
				
			 }catch(Exception e){
					e.printStackTrace();
				
				}
			
			return s;	
				}

	public int updatedetailsinshopping(Form f) {
		
		int i = 0;
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("update shopping set address=?, city=?,pincode=? ,state=?  where phone=?");
			ps.setString(1, f.getAddress());

			ps.setString(2, f.getCity());
			ps.setString(3, f.getPincode());
			ps.setString(4, f.getState());
			ps.setString(5, f.getPhone());
			i = ps.executeUpdate();
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return i;
	}

	public ArrayList<Admin> getshoppingDetails() {
		
		ArrayList<Admin> list = new ArrayList<Admin>();
		Connection con = null;
		
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from shopping");
		
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())	{
				Admin a = new Admin(rs.getString("id"),rs.getString("phone"),rs.getString("cname"),rs.getString("pic"),rs.getString("pname"),rs.getInt("model"),rs.getString("price"),rs.getString("address"),rs.getString("city"),rs.getString("pincode"),rs.getString("state"));
				list.add(a);
			
			}	
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	
		return list;
}



}

