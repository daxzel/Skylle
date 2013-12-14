instaloggerApp.factory('logLevels', function () {
    var logLevels = {
        10000: {
            id: 10000,
            alertStyle: 'alert-debug',
            show: true,
            buttonName: "Debug",
            buttonStyle: 'btn-debug'
        },
        20000: {
            id: 20000,
            alertStyle: 'alert-info',
            show: true,
            buttonName: "Info",
            buttonStyle: 'btn-info'
        },
        30000: {
            id: 30000,
            alertStyle: 'alert-warning',
            show: true,
            buttonName: "Warning",
            buttonStyle: 'btn-warning'
        },
        40000: {
            id: 40000,
            alertStyle: 'alert-danger',
            show: true,
            buttonName: "Error",
            buttonStyle: 'btn-danger'
        }
    }

    return logLevels;
});