package com.elib.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.elib.beans.CarBean;

public class CarDao {

	public static int save(CarBean bean){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("insert into car(carname,carnum,seats,rent,status) values(?,?,?,?,?)");
			ps.setString(1,bean.getCarName());
			ps.setString(2,bean.getCarNum());
			ps.setInt(3,bean.getSeats());
			ps.setLong(4,bean.getRent());
			ps.setString(5, bean.getStatus());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	public static int update(CarBean bean){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("update car set carname=?,carnum=?,seats=?,rent=?,status=? where id=?");
			ps.setString(1,bean.getCarName());
			ps.setString(2,bean.getCarNum());
			ps.setInt(3,bean.getSeats());
			ps.setLong(4,bean.getRent());
			ps.setString(5,bean.getStatus());
			ps.setInt(6,bean.getId());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	public static List<CarBean> view(){
		List<CarBean> list=new ArrayList<CarBean>();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from car");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				CarBean bean=new CarBean();
				bean.setId(rs.getInt("id"));
				bean.setCarName(rs.getString("carname"));
				bean.setCarNum(rs.getString("carnum"));
				bean.setSeats(rs.getInt("seats"));
				bean.setRent(rs.getLong("rent"));
				bean.setStatus(rs.getString("status"));
				list.add(bean);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
	public static CarBean viewById(int id){
		CarBean bean=new CarBean();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from car where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				bean.setId(rs.getInt(1));
				bean.setCarName(rs.getString(2));
				bean.setCarNum(rs.getString(3));
				bean.setSeats(rs.getInt(4));
				bean.setRent(rs.getLong(5));
				bean.setStatus(rs.getString(6));
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return bean;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("delete from car where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}

	public static boolean authenticate(String email,String password){
		boolean status=false;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from car where email=? and password=?");
			ps.setString(1,email);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				status=true;
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
}
