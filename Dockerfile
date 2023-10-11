FROM python:latest

WORKDIR /app

COPY requirements.txt .

RUN ["pip", "install", "-r", "requirements.txt"]

COPY . .

RUN ["reflex", "init"]

EXPOSE 3000
EXPOSE 8000

ENTRYPOINT ["reflex", "run"]
CMD ["--env", "prod"]