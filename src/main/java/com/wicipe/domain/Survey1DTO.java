package com.wicipe.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter // Getter 생성
@Setter // Setter 생성
public class Survey1DTO {
	@JsonProperty("username")
	private String username;
	@JsonProperty("dogname")
	private String dogname;
	@JsonProperty("breed")
	private String breed;
	@JsonProperty("weight")
	private float weight;
	@JsonProperty("form1")
	private int form1;
	@JsonProperty("form2")
	private int form2;
	@JsonProperty("age")
	private int age;
	@JsonProperty("age_survey1")
	private int age_survey1;
	@JsonProperty("age_survey2")
	private int age_survey2;
	@JsonProperty("isNeutral")
	private int isNeutral;
	@JsonProperty("gender")
	private int gender;
	@JsonProperty("pregnant")
	private int pregnant;
	
	@JsonProperty("disease1")
	private int disease1;
	@JsonProperty("disease2")
	private int disease2;
	@JsonProperty("disease3")
	private int disease3;
	@JsonProperty("disease4")
	private int disease4;
	@JsonProperty("disease5")
	private String disease5;
	
	@JsonProperty("food1")
	private int food1;
	@JsonProperty("food2")
	private int food2;
	@JsonProperty("food3")
	private int food3;
	@JsonProperty("food4")
	private int food4;
	@JsonProperty("food5")
	private int food5;
	@JsonProperty("food6")
	private String food6;
	
	@JsonProperty("allergy1")
	private int allergy1;
	@JsonProperty("allergy2")
	private int allergy2;
	@JsonProperty("allergy3")
	private int allergy3;
	@JsonProperty("allergy4")
	private int allergy4;
	@JsonProperty("allergy5")
	private int allergy5;
	@JsonProperty("allergy6")
	private int allergy6;
	@JsonProperty("allergy7")
	private String allergy7;
	
	@JsonProperty("tool1")
	private int tool1;
	@JsonProperty("tool2")
	private int tool2;
	@JsonProperty("tool3")
	private int tool3;
	@JsonProperty("tool4")
	private int tool4;
	@JsonProperty("tool5")
	private int tool5;
	@JsonProperty("tool6")
	private String tool6;
	
	
	public Survey1DTO(Object username, Object dogname, Object breed, Object weight, Object form1, Object form2, Object age, Object age_survey1, Object age_survey2, Object isNeutral, Object gender, Object pregnant, Object disease1, Object disease2, Object disease3, Object disease4, Object disease5, Object food1, Object food2, Object food3, Object food4, Object food5, Object food6, Object allergy1, Object allergy2, Object allergy3, Object allergy4, Object allergy5, Object allergy6, Object allergy7, Object tool1, Object tool2, Object tool3, Object tool4, Object tool5, Object tool6) {
		if (username != null)
			this.username = username.toString();
		if (dogname != null)
			this.dogname = dogname.toString();
		if (breed != null)
			this.breed = (String) breed;
		if (weight != null)
			this.weight = Float.valueOf((String) weight);
		if (form1 != null)
			this.form1 = (int) form1;//Integer.valueOf((String) form1);
		if (form2 != null)
			this.form2 = (int) form2;//Integer.valueOf((String) form2);
		if (age != null)
			this.age = Integer.valueOf((String) age);
		if (age_survey1 != null)
			this.age_survey1 = (int) age_survey1;//Integer.valueOf((String) age_survey1);
		if (age_survey2 != null)
			this.age_survey2 = (int) age_survey2;//Integer.valueOf((String) age_survey2);
		if (isNeutral != null)
			this.isNeutral = (int) isNeutral;//Integer.valueOf((String) isNeutral);
		if (gender != null)
			this.gender = (int) gender;//Integer.valueOf((String) gender);
		if (pregnant != null)
			this.pregnant = (int) pregnant;//Integer.valueOf((String) pregnant);
		
		if (disease1 != null)
			this.disease1 = (int) disease1;//Integer.valueOf((String) disease1);
		if (disease2 != null)
			this.disease2 = (int) disease2;//Integer.valueOf((String) disease2);
		if (disease3 != null)
			this.disease3 = (int) disease3;//Integer.valueOf((String) disease3);
		if (disease4 != null)
			this.disease4 = (int) disease4;//Integer.valueOf((String) disease4);
		if (disease5 != null)
			this.disease5 = disease5.toString();
		
		if (food1 != null)
			this.food1 = (int) food1;//Integer.valueOf((String) food1);
		if (food2 != null)
			this.food2 = (int) food2;//Integer.valueOf((String) food2);
		if (food3 != null)
			this.food3 = (int) food3;//Integer.valueOf((String) food3);
		if (food4 != null)
			this.food4 = (int) food4;//Integer.valueOf((String) food4);
		if (food5 != null)
			this.food5 = (int) food5;//Integer.valueOf((String) food5);
		if (food6 != null)
			this.food6 = food6.toString();

		if (allergy1 != null)
			this.allergy1 = (int) allergy1;//Integer.valueOf((String) allergy1);
		if (allergy2 != null)
			this.allergy2 = (int) allergy2;//Integer.valueOf((String) allergy2);
		if (allergy3 != null)
			this.allergy3 = (int) allergy3;//Integer.valueOf((String) allergy3);
		if (allergy4 != null)
			this.allergy4 = (int) allergy4;//Integer.valueOf((String) allergy4);
		if (allergy5 != null)
			this.allergy5 = (int) allergy5;//Integer.valueOf((String) allergy5);
		if (allergy6 != null)
			this.allergy6 = (int) allergy6;//Integer.valueOf((String) allergy6);
		if (allergy7 != null)
			this.allergy7 = allergy7.toString();

		if (tool1 != null)
			this.tool1 = (int) tool1;//Integer.valueOf((String) tool1);
		if (tool2 != null)
			this.tool2 = (int) tool2;//Integer.valueOf((String) tool2);
		if (tool3 != null)
			this.tool3 = (int) tool3;//Integer.valueOf((String) tool3);
		if (tool4 != null)
			this.tool4 = (int) tool4;//Integer.valueOf((String) tool4);
		if (tool5 != null)
			this.tool5 = (int) tool5;//Integer.valueOf((String) tool5);
		if (tool6 != null)
			this.tool6 = tool6.toString();
	}
}
