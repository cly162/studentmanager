package com.mqxu.sm.frame;

import com.mqxu.sm.frame.AdminLoginFrame;
import entity.Department;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
  *@ClassName MainFrame
  *@Description TODO
  *@Author yoRoll.z
  *@Date 2020/11/20
**/

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JButton 院系管理button;
    private JButton 班级管理button;
    private JButton 学生管理button;
    private JButton 奖惩管理button;
    private JPanel CenterPanel;
    private JPanel departmentPanel;
    private JPanel studentPane;
    private JPanel classPanel;
    private JPanel rewardPanel;
    private JPanel leftPanel;
    private JPanel bottonPanel;
    private JButton 新增院系Button;
    private JButton 切换显示Button;

    public MainFrame(){


        this.setTitle("MainFrame");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setVisible(true);

    }

    public  static  void main(String[] args){
        new AdminLoginFrame();
    }
}
