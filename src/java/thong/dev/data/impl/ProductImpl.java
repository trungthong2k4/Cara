package thong.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import thong.dev.data.dao.ProductDao;
import thong.dev.data.driver.MySQLDriver;
import thong.dev.data.model.Product;

public class ProductImpl implements ProductDao {

    Connection con = MySQLDriver.getInstance().getConnection();

    @Override
    public boolean insert(Product product) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO PRODUCTS(ID, NAME, DESCRIPTION, THUMBNAIL, PRICE, QUANTITY, VIEW, CATEGORY_ID) VALUES(NULL, ?, ?, ?, ?, ?, 0, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getDescription());
            stmt.setString(3, product.getThumbnail());
            stmt.setDouble(4, product.getPrice());
            stmt.setInt(5, product.getQuantity());
            stmt.setInt(6, product.getCategoryId());
            stmt.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Product product) {
        // TODO Auto-generated method stub
        String sql = "UPDATE PRODUCTS SET name = ?, description = ?, thumbnail = ?, price = ?, quantity = ?, category_id = ? WHERE id = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getDescription());
            stmt.setString(3, product.getThumbnail());
            stmt.setDouble(4, product.getPrice());
            stmt.setInt(5, product.getQuantity());
            stmt.setInt(6, product.getCategoryId());
            stmt.setInt(7, product.getId());
            return stmt.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        String sql = "DELETE FROM PRODUCTS WHERE ID =?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            return stmt.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Product find(int id) {
        // TODO Auto-generated method stub
        String sql = "SELECT * FROM PRODUCTS WHERE ID = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                int categoryId = rs.getInt("category_id");
                Timestamp created_at = rs.getTimestamp("created_at");
                return new Product(id, name, description, thumbnail, price, quantity, categoryId, view, created_at);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        List<Product> prodList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS ORDER BY VIEW DESC";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                int categoryId = rs.getInt("category_id");
                Timestamp created_at = rs.getTimestamp("created_at");
                prodList.add(new Product(id, name, description, thumbnail, price, quantity, categoryId, view, created_at));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return prodList;
    }

    @Override
    public List<Product> hot(int limit) {
        List<Product> prodList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS ORDER BY VIEW DESC LIMIT ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, limit);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                int categoryId = rs.getInt("category_id");
                Timestamp created_at = rs.getTimestamp("created_at");
                prodList.add(new Product(id, name, description, thumbnail, price, quantity, categoryId, view, created_at));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return prodList;
    }

    @Override
    public List<Product> news(int limit) {
        List<Product> prodList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS ORDER BY created_at DESC LIMIT ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, limit);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                int categoryId = rs.getInt("category_id");
                Timestamp created_at = rs.getTimestamp("created_at");
                prodList.add(new Product(id, name, description, thumbnail, price, quantity, categoryId, view, created_at));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prodList;
    }

    @Override
    public List<Product> related(int related, int categoryId) {
        List<Product> prodList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS WHERE CATEGORY_ID = ? LIMIT ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, categoryId);
            stmt.setInt(2, related);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                Timestamp created_at = rs.getTimestamp("created_at");
                prodList.add(new Product(id, name, description, thumbnail, price, quantity, categoryId, view, created_at));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return prodList;
    }

    @Override
    public List<Product> findByCategory(int categoryId) {
        List<Product> prodList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS WHERE category_id = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, categoryId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                Timestamp created_at = rs.getTimestamp("created_at");
                prodList.add(new Product(id, name, description, thumbnail, price, quantity, categoryId, view, created_at));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prodList;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> prodList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS WHERE NAME LIKE ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + name + "%"); // Use wildcards for partial matches
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String productName = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                int categoryId = rs.getInt("category_id");
                Timestamp created_at = rs.getTimestamp("created_at");
                prodList.add(new Product(id, productName, description, thumbnail, price, quantity, categoryId, view, created_at));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prodList;
    }

    @Override
    public List<Product> filter(int categoryId, String propertyName, String order) {
        List<Product> prodList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS WHERE category_id = ? ORDER BY " + propertyName + " " + order;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, categoryId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                Timestamp created_at = rs.getTimestamp("created_at");
                prodList.add(new Product(id, name, description, thumbnail, price, quantity, categoryId, view, created_at));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prodList;
    }

    @Override
    public List<Product> getProducts(int from, int amount) {
        List<Product> prodList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS ORDER BY id LIMIT ?, ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, from);
            stmt.setInt(2, amount);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                int categoryId = rs.getInt("category_id");
                Timestamp created_at = rs.getTimestamp("created_at");
                prodList.add(new Product(id, name, description, thumbnail, price, quantity, categoryId, view, created_at));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return prodList;
    }

    @Override
    public List<Product> findAllWithCategory() {
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT products.*, categories.name AS category_name FROM products "
                + "LEFT JOIN categories ON products.category_id = categories.id";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                int categoryId = rs.getInt("category_id");
                Timestamp createdAt = rs.getTimestamp("created_at");
                String categoryName = rs.getString("category_name");

                Product product = new Product(id, name, description, thumbnail, price, quantity, categoryId, view, createdAt);
                product.setCategoryName(categoryName);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }


}
