import sys
import json
import yaml

inputFileName = sys.argv[1]
outputFileName = sys.argv[2]

with open(inputFileName) as data_file:
   data = json.load(data_file)
with open(outputFileName, "w") as output:
   yaml.safe_dump(data, output)
