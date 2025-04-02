# Sử dụng Node.js 18
FROM node:18

# Đặt thư mục làm việc trong container
WORKDIR /usr/src/app

# Copy toàn bộ file vào container
COPY package*.json ./
RUN npm install

COPY . .

# Chạy ứng dụng
CMD ["node", "server.js"]
