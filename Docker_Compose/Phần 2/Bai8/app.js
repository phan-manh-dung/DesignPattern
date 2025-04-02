const mysql = require('mysql2');
const express = require('express');
const app = express();
const port = 3000;

// Lấy các giá trị từ biến môi trường
const db = mysql.createConnection({
  host: process.env.DB_HOST || 'localhost',
  user: process.env.DB_USER || 'root',
  password: process.env.DB_PASSWORD || 'rootpassword',
  database: process.env.DB_NAME || 'mydb',
});

db.connect(err => {
  if (err) {
    console.error('Lỗi kết nối MySQL: ', err);
    return;
  }
  console.log('Kết nối MySQL thành công!');
});

app.get('/', (req, res) => {
  res.send('Node.js connected to MySQL');
});

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}`);
});
