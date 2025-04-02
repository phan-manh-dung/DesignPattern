# Sử dụng image Python chính thức
FROM python:3.9

# Cài đặt thư mục làm việc trong container
WORKDIR /usr/src/app

# Copy tệp requirements.txt vào container
COPY requirements.txt ./

# Cài đặt các dependencies
RUN pip install --no-cache-dir -r requirements.txt

# Copy mã nguồn ứng dụng vào container
COPY . .

# Mở port 5000
EXPOSE 5000

# Chạy ứng dụng Flask
CMD ["python", "app.py"]
