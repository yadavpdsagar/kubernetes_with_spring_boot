# Step 1: Build the React application
FROM node:18 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json to the container
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application code to the container
COPY . .

# Build the React app for production
RUN npm run build

# Step 2: Serve the application using Nginx
FROM nginx:stable-alpine

# Copy the built React app from the previous stage to the Nginx web root
COPY --from=build /app/build /usr/share/nginx/html

# Copy custom Nginx configuration if needed (optional)
# COPY nginx.conf /etc/nginx/conf.d/default.conf

# Expose the port Nginx runs on (default: 80)
EXPOSE 80

# Start Nginx
CMD ["nginx", "-g", "daemon off;"]
