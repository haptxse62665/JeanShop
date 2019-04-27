export default {
  items: [
    {
      name: 'Dashboard',
      url: '/dashboard',
      icon: 'icon-speedometer',
      badge: {
        variant: 'primary',
        text: 'Home'
      }
    },
    {
      title: true,
      name: 'Volunteers',
      class: '',
      wrapper: {
        element: '',
        attributes: {}
      }
    },
    {
      name: 'Accounts',
      url: '/',
      icon: 'icon-people',
      children: [
        {
          name: 'Admin',
          url: '/account-admins',
          icon: 'icon-globe'
        },
        {
          name: 'Users',
          url: '/account-users',
          icon: 'icon-directions'
        },
      ]
    },
    {
      name: 'Roles',
      url: '/roles',
      icon: 'icon-directions'
    },
    {
      name: 'Organizations',
      url: '/',
      icon: 'icon-globe',
      children: [
        {
          name: 'Organizations',
          url: '/organizations',
          icon: 'icon-globe'
        }
      ]
    },
    {
      name: 'Events',
      url: '/',
      icon: 'icon-flag',
      children: [
        {
          name: 'Events',
          url: '/events',
          icon: 'icon-list'
        },
        {
          name: 'Event Types',
          url: '/events-type',
          icon: 'icon-flag'
        }
      ]
    },
    {
      name: 'News',
      url: '/news',
      icon: 'icon-book-open'
    },
    {
      title: true,
      name: 'System',
      class: '',
      wrapper: {
        element: '',
        attributes: {}
      }
    },
    {
      name: 'Configurations',
      url: '/configurations',
      icon: 'icon-puzzle'
    },
    {
      name: 'System Information',
      url: '/systems',
      icon: 'icon-info'
    }
  ]
}