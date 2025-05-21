package com.example.myapplication1; // Thay bằng package của bạn

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText etUsername;
    private TextInputEditText etPassword;
    private Button btnLogin;
    private TextView tvForgotPassword;
    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Ánh xạ các thành phần từ layout
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvRegister = findViewById(R.id.tvRegister);

        // Xử lý sự kiện click cho nút Đăng nhập
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Vui lòng nhập đầy đủ tên đăng nhập và mật khẩu", Toast.LENGTH_SHORT).show();
                } else {
                    // Đây là nơi bạn sẽ gọi API hoặc kiểm tra thông tin đăng nhập với cơ sở dữ liệu
                    // Ví dụ đơn giản:
                    if (username.equals("admin") && password.equals("123456")) {
                        Toast.makeText(LoginActivity.this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                        // Chuyển sang màn hình chính (ví dụ: MainActivity)
                        // Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        // startActivity(intent);
                        // finish(); // Đóng LoginActivity để người dùng không thể quay lại
                    } else {
                        Toast.makeText(LoginActivity.this, "Tên đăng nhập hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        // Xử lý sự kiện click cho "Quên mật khẩu?"
        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Chuyển đến màn hình Quên mật khẩu", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                // startActivity(intent);
            }
        });

        // Xử lý sự kiện click cho "Đăng ký ngay"
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Chuyển đến màn hình Đăng ký", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                // startActivity(intent);
            }
        });
    }
}