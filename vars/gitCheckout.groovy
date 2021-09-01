def call(Map stageParams) {

    // 'https://github.com/sjc1014/my-groovy-shared-libary.git'
    checkout([
            $class: 'GitSCM',
            branches: [[ name: stageParams.branch ]],
            extensions: [],
            userRemoteConfigs: [[url: stageParams.url ]]
    ])
}

