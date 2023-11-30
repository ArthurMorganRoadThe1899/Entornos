FROM nginx

COPY --chown=nginx:nginx html_content/index.html /usr/share/nginx/html/index.html
COPY --chown=nginx:nginx html_content/index.css /usr/share/nginx/html/index.css
COPY --chown=nginx:nginx html_content/tareas /usr/share/nginx/html/tareas
COPY --chown=nginx:nginx html_content/images /usr/share/nginx/html/images

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
