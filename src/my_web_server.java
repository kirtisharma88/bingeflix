
import java.util.Properties;
import com.vmm.JHTTPServer;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class my_web_server extends JHTTPServer {

    public my_web_server(int portno) throws Exception {
        super(portno);
    }

    @Override
    public Response serve(String uri, String method, Properties header, Properties parms, Properties files) {

        Response res = new Response(HTTP_OK, "text/plain", "Hi");
        System.out.println("uri--------------->" + uri);
        if (uri.equals("/login")) {
            String user = parms.getProperty("username");
            String pass = parms.getProperty("password");
            try {
                ResultSet rs = db_loader.executeSQL("select *  from admin where username='" + user + "' and password='" + pass + "'");
                if (rs.next()) {
                    res = new Response(HTTP_OK, "text/plain", "success");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "fails");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.equals("/admin_change_password")) {
            String op = parms.getProperty("old_password");
            String np = parms.getProperty("new_password");
            String u = parms.getProperty("username");

            try {
                ResultSet rs = db_loader.executeSQL("select *  from admin where username='" + u + "' and  password='" + op + "'");
                if (rs.next()) {
                    rs.updateString("password", np);
                    rs.updateRow();
                    res = new Response(HTTP_OK, "text/plain", "success");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "fails");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (uri.equals("/admin_add_category")) {
            String cn = parms.getProperty("category_name");
            String des = parms.getProperty("description");

            try {
                ResultSet rs = db_loader.executeSQL("select *  from category where category_name='" + cn + "' ");
                if (rs.next()) {

                    res = new Response(HTTP_OK, "text/plain", "fails");
                } else {

                    String filename = saveFileOnServerWithRandomName(files, parms, "photo", "src/bingeflixPhotos");
                    System.out.println("photoname   " + filename);
                    String photoname = "src/bingeflixPhotos/" + filename;
                    rs.moveToInsertRow();
                    rs.updateString("category_name", cn);
                    rs.updateString("description", des);
                    rs.updateString("photo", photoname);
                    rs.insertRow();
                    res = new Response(HTTP_OK, "text/plain", "success");

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.equals("/getAllCategories")) {

            String ans = "";

            try {
                ResultSet rs = db_loader.executeSQL("select *  from category");
                while (rs.next()) {
                    String category_name = rs.getString("category_name");
                    String description = rs.getString("description");
                    String photo = rs.getString("photo");

                    ans += category_name + "**" + description + "**" + photo + "#$#";
                }
                res = new Response(HTTP_OK, "text/plain", ans);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (uri.equals("/admindeletecategory")) {
            String category_name = parms.getProperty("catname");
            ResultSet rs = db_loader.executeSQL("select *  from category where category_name='" + category_name + "'");
            try {
                if (rs.next()) {
                    rs.deleteRow();
                    res = new Response(HTTP_OK, "text/plain", "success");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "fails");
                }
                //get catname
                //rs= DBloader(select * from category where category_name=+catname)
//            if(rs.next)
//delete row
//            send response success
//            else
//            send response fails
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }else if (uri.equals("/getCategory")) {
            //getcategories from database and append them in a string 
            String ans = "";
            try {
                ResultSet rs = db_loader.executeSQL("select * from category");
                while (rs.next()) {
                    String catname = rs.getString("category_name");

                    ans += catname + "**";
                }
                //ans==== demo*photo*pic
                res = new Response(HTTP_OK, "text/plain", ans);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.equals("/addmovie")) {
            String cat = parms.getProperty("category");
            String mn = parms.getProperty("movie_name");
            String desc = parms.getProperty("description");

            int amt = Integer.parseInt(parms.getProperty("amount"));
            try {

                ResultSet rs = db_loader.executeSQL("select *  from movie where movie_name='" + mn + "' and category='" + cat + "'");

                if (rs.next()) {
                    res = new Response(HTTP_OK, "text/plain", "fail");
                } else {

                    String filename = saveFileOnServerWithRandomName(files, parms, "square_photo", "src/bingeflixPhotos");
                    System.out.println("photoname   " + filename);
                    String photoname = "src/bingeflixPhotos/" + filename;

                    String filename2 = saveFileOnServerWithRandomName(files, parms, "wide_photo", "src/bingeflixPhotos");
                    System.out.println("photoname2   " + filename2);
                    String photoname2 = "src/bingeflixPhotos/" + filename2;

                    String filename3 = saveFileOnServerWithRandomName(files, parms, "sample_video", "src/bingeflixPhotos");
                    System.out.println("sample_video   " + filename3);
                    String photoname3 = "src/bingeflixPhotos/" + filename3;

                    rs.moveToInsertRow();
                    rs.updateString("category", cat);
                    rs.updateString("movie_name", mn);
                    rs.updateString("description", desc);
                    rs.updateInt("amount", amt);
                    rs.updateString("square_photo", photoname);
                    rs.updateString("wide_photo", photoname2);
                    rs.updateString("sample_video", photoname3);

                    rs.insertRow();

                    res = new Response(HTTP_OK, "text/plain", "success");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } else if (uri.equals("/getAllMovies")) {

            String ans = "";

            try {
                ResultSet rs = db_loader.executeSQL("select *  from movie");
                while (rs.next()) {
                    String movieid = rs.getString("movie_id");

                    String movieName = rs.getString("movie_name");
                    String description = rs.getString("description");
                    String squarePhoto = rs.getString("square_photo");
                    String wide_photo = rs.getString("wide_photo");
                    String sample_video = rs.getString("sample_video");
                    String amount = rs.getString("amount");

                    ans += movieid + "*" + movieName + "" + description + "" + squarePhoto + "" + wide_photo + "" + sample_video + "*" + amount + "#$#";
                }
                res = new Response(HTTP_OK, "text/plain", ans);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return res;
    }

}

       
    


