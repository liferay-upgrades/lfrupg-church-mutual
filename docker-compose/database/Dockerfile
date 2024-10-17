FROM mcr.microsoft.com/mssql/server:2022-CU13-ubuntu-22.04

RUN mkdir -p /var/opt/mssql/backup

COPY docker-compose/database-dump/lportal.bak /var/opt/mssql/backup/
COPY docker-compose/database/setup-database.sh setup-database.sh
COPY docker-compose/database/shrink-database-log-file.sql shrink-database-log-file.sql
COPY docker-compose/database/entrypoint.sh entrypoint.sh

CMD /bin/bash ./entrypoint.sh