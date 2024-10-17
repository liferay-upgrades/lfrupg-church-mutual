#!/usr/bin/env bash

set -m
./opt/mssql/bin/sqlservr & ./setup-database.sh
fg