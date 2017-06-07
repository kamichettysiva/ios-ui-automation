#!/usr/bin/env bash
declare -a uid=("6B35A7EE-0C66-456E-9E2C-593EB9D18A15" "AEB4A701-905D-48B2-9B67-0D528DE339C0")
declare -a port=("8101" "8102")
webDrivelaunch=“”

for ((i=0; i<${#uid[*]}; i++));
do
fbsimctl/fbsimctl ${uid[i]} boot
webDrivelaunch=“$webDrivelaunch fbsimctl/fbsimctl ${uid[i]}  launch_xctest WebDriverAgentRunner-Runner.app/PlugIns/WebDriverAgentRunner.xctest com.apple.Preferences --port ${port[i]} -- listen &” 

done

echo $webDrivelaunch

