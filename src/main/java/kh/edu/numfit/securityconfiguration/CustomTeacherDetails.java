package kh.edu.numfit.securityconfiguration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import kh.edu.numfit.model.TeacherModel;

@SuppressWarnings("serial")
public class CustomTeacherDetails implements UserDetails {
	private TeacherModel teacher;
	
	public CustomTeacherDetails(TeacherModel teacher) {
		this.teacher = teacher;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		//System.out.println("user role is "+teacher.getRole().toString());
		List<GrantedAuthority> autorities = new ArrayList<>();
		autorities.add(new SimpleGrantedAuthority("ROLE_"+teacher.getRole().toString()));
		return autorities;
	}

	@Override
	public String getPassword() {
		//System.out.println("password is "+teacher.getPwd());
		return teacher.getPwd();
	}

	@Override
	public String getUsername() {
		//System.out.println("username is "+teacher.getPhoneNumber());
		return teacher.getPhoneNumber();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
