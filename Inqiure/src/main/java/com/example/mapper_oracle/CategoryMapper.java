package com.example.mapper_oracle;

import java.util.HashMap;
import java.util.List;

import com.example.domain.CategoryVO;


public interface CategoryMapper {

	public void categoryinsert(CategoryVO vo);
	public List<HashMap<String, Object>> categorylist(); //기초설정시_중분류 입력
	public List<HashMap<String, Object>> lcategorylist(); //입력시_중분류 입력
	public void categoryupdate(CategoryVO vo);
}
