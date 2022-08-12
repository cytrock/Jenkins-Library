// 读取resources中的配置
def configString = libraryResource encoding: 'utf-8', resource:'config.json'
def configJson = readJson text:configString
def name = configJson['name']

// 获取groovy 中版本库分支
def branch = env.getEnvironment()['library.Library.version']