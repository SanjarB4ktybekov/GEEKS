package com.example.demo.repository;
import com.example.demo.model.Task;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class TaskRepository {
    private final JdbcTemplate jdbc;
    public TaskRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public void storeTask(Task task) {
        String sql =
                "INSERT INTO task VALUES (?, ?, ?, ?)";
        jdbc.update(sql,
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getCompleted());
    }
    public List<Task> findAllPurchases() {
        String sql = "SELECT * FROM task";
        RowMapper<Task> purchaseRowMapper = (r, i) -> {
            Task task = new Task();
            task.setId(r.getInt("id"));
            task.setTitle(r.getString("title"));
            task.setDescription(r.getString("description"));
            task.setCompleted(r.getBoolean("completed"));
            return task;
        };
        return jdbc.query(sql, purchaseRowMapper);
    }
}