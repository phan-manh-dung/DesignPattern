# Dùng image Python base
FROM python:3.9-slim

# Thiết lập thư mục làm việc trong container
WORKDIR /usr/src/app

# Copy các tệp yêu cầu vào container
COPY requirements.txt ./

# Cài đặt các thư viện cần thiết
RUN pip install --no-cache-dir -r requirements.txt

# Copy toàn bộ mã nguồn vào container
COPY . .

# Mở port Flask (5000)
EXPOSE 5000

# Chạy Flask app
CMD ["python", "app.py"]
