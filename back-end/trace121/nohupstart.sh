cd "$(dirname "$0")"
nohup mvn spring-boot:run > trace.out 2>&1 &
#��δд��־·��
#nohup mvn spring-boot:run >> /log.txt 2>&1 &