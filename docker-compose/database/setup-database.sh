#!/usr/bin/env bash

# Wait for database to startup
sleep 10

# Create new database (just for testing)
# /opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P 'Liferay123!' -Q 'CREATE DATABASE Liferay'

# Import Database
/opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P 'Liferay123!' -Q 'RESTORE DATABASE Liferay FROM DISK = "/var/opt/mssql/backup/lportal.bak" WITH MOVE "data_0" TO "/var/opt/mssql/data/Liferay.mdf", MOVE "log" TO "/var/opt/mssql/data/Liferay_log.ldf", MOVE "XTP" TO "/var/opt/mssql/data/Liferay.xtp"'
/opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P 'Liferay123!' -i shrink-database-log-file.sql