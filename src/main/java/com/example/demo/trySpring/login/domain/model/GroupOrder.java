package com.example.demo.trySpring.login.domain.model;

import javax.validation.GroupSequence;




//グループの実行順序
@GroupSequence({ValidGroup1.class, ValidGroup2.class, ValidGroup3.class})public interface GroupOrder {

}