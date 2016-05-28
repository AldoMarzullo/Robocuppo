mkdir -p "robocupFiles"
cd robocupFiles
rcssserver &
rcssmonitor &
echo "press a key to interrupt"
read var
pidof rcssmonitor | xargs kill
pidof rcssserver | xargs kill
