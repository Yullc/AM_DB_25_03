//package org.example;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class JDBCModify {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//
//        List<Article> list = new ArrayList<>();
//        try {
//            Class.forName("org.mariadb.jdbc.Driver");
//            String url = "jdbc:mariadb://127.0.0.1:3306/AM_DB_25_03?useUnicode=true&characterEncoding=utf8&autoReconnect=true&serverTimezone=Asia/Seoul";
//            conn = DriverManager.getConnection(url, "root", "");
//           System.out.println("연결 성공!");
//
//            String sql = "update article set title=?, body=? where id=?";
//            sql += " set regDate = now(),";
//            sql += "updateDate = now(),";
//
//            System.out.println(sql);
//
//            pstmt = conn.prepareStatement(sql);
//            rs = pstmt.executeQuery(sql);
//
//            String newtilte = sc.nextLine();
//            String newbody = sc.nextLine();
//            list.add(id, regDate, updateDate, title, bodyy);
//
////
//
//
//        } catch (ClassNotFoundException e) {
//            System.out.println("드라이버 로딩 실패" + e);
//        } catch (SQLException e) {
//            System.out.println("에러 : " + e);
//        } finally {
//            try {
//                if (rs != null && !rs.isClosed()) {
//                    rs.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (pstmt != null && !pstmt.isClosed()) {
//                    pstmt.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (conn != null && !conn.isClosed()) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}