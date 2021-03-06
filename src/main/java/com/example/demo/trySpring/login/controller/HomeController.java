package com.example.demo.trySpring.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.trySpring.login.domain.model.repository.jdbc.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;

	//ホーム画面のGET用メソッド
	@GetMapping("/home")
	public String getHome(Model model) {

		//コンテンツ部分にホーム画面を表示するための文字列を登録
		model.addAttribute("contents", "login/home :: home_contents");

		return "login/homeLayout";
	}

	//ログアウト用メソッド
	@PostMapping("/layout")
	public String postLogout() {

		//ログイン画面にredirect
		return "redirect:/login";
	}
}