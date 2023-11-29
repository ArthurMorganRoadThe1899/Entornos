FROM nginx

COPY --chown=nginx:nginx index.html /usr/share/nginx/html/index.html
COPY --chown=nginx:nginx perrito.jpg /usr/share/nginx/html/perrito.jpg

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
