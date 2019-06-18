package cn.tedu.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SampleBean {
	
	// Alex, Lucy, Kitty, Henry
	public List<String> names;
	
	// Beijing, Shanghai, Guangzhou, Shenzhen
	public Set<String> cities;
	
	// username=Jack, password=1234, from=Nanjing
	public Map<String, String> session;
	
	// 9, 5, 2, 7
	public Integer[] numbers;
	
	// JDBC≈‰÷√
	public Properties config;

	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setCities(Set<String> cities) {
		this.cities = cities;
	}

	public void setSession(Map<String, String> session) {
		this.session = session;
	}

	public void setNumbers(Integer[] numbers) {
		this.numbers = numbers;
	}

	public void setConfig(Properties config) {
		this.config = config;
	}

}
