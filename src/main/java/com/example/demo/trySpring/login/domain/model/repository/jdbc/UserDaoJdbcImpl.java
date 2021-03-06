package com.example.demo.trySpring.login.domain.model.repository.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.trySpring.login.domain.model.User;
import com.example.demo.trySpring.login.domain.model.repository.UserDao;

@Repository
public class UserDaoJdbcImpl implements UserDao {

	@Autowired
	JdbcTemplate jdbc;

	//Userテーブルの件数を取得
	@Override
	public int count() throws DataAccessException {
		return 0;
	}

	//Userテーブルにデータを1件insert
	@Override
	public int insertOne(User user) throws DataAccessException {

		//insert
		//１件登録
		int rowNumber = jdbc.update("INSERT INTO m_user(user_id,"
				+ "password,"
				+ "user_name,"
				+ "birthday,"
				+ "age,"
				+ "marriage,"
				+ "role)"
				+ "VALUES(?,?,?,?,?,?,?)"
				, user.getUserId()
				, user.getPassword()
				, user.getUserName()
				, user.getBirthday()
				, user.getAge()
				, user.isMarriage()
				, user.getRole());

		return rowNumber;
	}

	//Userテーブルのデータを１件取得
	@Override
	public User selectOne(String userId) throws DataAccessException {
		return null;
	}

	//Userテーブルの全データを取得
	@Override
	public List<User> selectMany() throws DataAccessException {
		return null;
	}

	//Userテーブルを１件更新
	@Override
	public int updateOne(User user) throws DataAccessException {
		return 0;
	}

	//Userテーブルを１件削除
	@Override
	public int deleteOne(String userId) throws DataAccessException {
		return 0;
	}

	//Userテーブルの全データをCSVに出力する
	@Override
	public void userCsvOut() throws DataAccessException {

	}




}