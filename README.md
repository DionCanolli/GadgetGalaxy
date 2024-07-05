Project Title: GadgetGalaxy

Description: This is a Tech. E-Commerce Website, designed to buy / save to cart/wishlist tech gadgets such as Computers, Laptops, Phones, Headphones and PC Parts, as a USER (and ADMIN). However ADMIN user can insert and delete items, users and even transanctions made by users, using admin panel. You can sign up and login, but these aren't required, since the guest users can buy/save items using cookies (for every guest user, a cookie will be generated with an unique value, then it will be saved in database), and based on it's value, if the guest user buys, the cookie value will be saved in transaction, and user columns will remain null. As for the logged in user, it will use the user details for operations. Images of the products are saved in a folder called images, so when a product is added or deleted, its image will also. As for the products table, it has a column to save the image name, so the products image is called as the product name + .jpg, for example if a product is called MYPC, its image will be called MYPC.jpg.

Installation Instructions: Now you can see that there are 3 parts: The images folder, the databaseCode.sql script and project directory GadgetGalaxy. Now you gotta clone the GadgetGalaxy in your machine, then clone the databaseCode.sql and save it in Microsoft SQL Server Management Studio and run it in there. Place the images folder anywhere you want. Then in the project, in GadgetGalaxyApplication.java class, at addResourceHandlers method, specify the path of the images folder. Also in application.properties specify the correct path for spring.datasource.url for your db setup.

Technologies Used: Java, Spring Framework, Spring Boot, Spring Data JPA, Spring Security SQL Server

Features: As we said, this is a Tech. E-Commerce Website, designed to buy / save to cart/wishlist tech gadgets such as Computers, Laptops, Phones, Headphones and PC Parts, as a USER (and ADMIN). However ADMIN users can insert and delete items, users and even transanctions made by users, using admin panel. You can sign up and login, but these aren't required, since the guest users can buy/save items using cookies (for every guest user, a cookie will be generated with an unique value, then it will be saved in database), and based on it's value, if the guest user buys, the cookie value will be saved in transaction, and user columns will remain null. As for the logged in user, it will use the user details for operations. Images of the products are saved in a folder called images, so when a product is added or deleted, its image will also. As for the products table, it has a column to save the image name, so the products image is called as the product name + .jpg, for example if a product is called MYPC, its image will be called MYPC.jpg. When a User buys a product, there will be generated a transaction. You can directly buy the product from product page, or indirectly by saving it in the cart. 