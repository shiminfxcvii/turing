#!/bin/bash
set -eo pipefail
host="$(hostname -i || echo '127.0.0.1')"
if ping="$(redis-cli -h "$host" ping)" && [ "$ping" = 'PONG' ]; then
  exit 0
elif ping="$(redis-cli -h "$host" -a 'mmv202005' ping)" && [ "$ping" = 'PONG' ]; then
  exit 0
fi
exit 1
