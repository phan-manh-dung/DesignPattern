# Sử dụng image Node.js chính thức
FROM node:18

# Cài đặt thư mục làm việc
WORKDIR /usr/src/app

# Copy package.json và package-lock.json vào container
COPY package*.json ./

# Cài đặt các dependencies
RUN npm install

# Copy toàn bộ mã nguồn vào container
COPY . .

# Mở port 3000
EXPOSE 3000

# Chạy ứng dụng
CMD ["node", "app.js"]
