package com.example.mapper_oracle;

import java.util.HashMap;
import java.util.List;

import com.example.domain.CategoryVO;


public interface CategoryMapper {

	public void categoryinsert(CategoryVO vo);
	public List<HashMap<String, Object>> categorylist(); //���ʼ�����_�ߺз� �Է�
	public List<HashMap<String, Object>> lcategorylist(); //�Է½�_�ߺз� �Է�
	public void categoryupdate(CategoryVO vo);
}
